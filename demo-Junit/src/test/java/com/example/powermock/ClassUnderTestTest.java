package com.example.powermock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * ClassUnderTest Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/11/2019</pre>
 */
@RunWith(PowerMockRunner.class)
public class ClassUnderTestTest {

	/**
	 * Method: callArgumentInstance(File file)
	 * <p>
	 * <p>
	 * 普通 Mock（Mock 参数传递的对象）
	 */
	@Test
	public void testCallArgumentInstance() {
		// Mock 对象，也可以使用 org.mockito.Mock 注解标记来实现
		File file = mock(File.class);
		ClassUnderTest underTest = new ClassUnderTest();

		// 录制 Mock 对象行为
		when(file.exists()).thenReturn(true);

		// 验证方法行为
		Assert.assertTrue(underTest.callArgumentInstance(file));
	}

	/**
	 * Method: callInternalInstance(String path)
	 * <p>
	 * <p>
	 * Mock 方法内部 new 出来的对象
	 */
	@Test
	@PrepareForTest(ClassUnderTest.class)
	public void testCallInternalInstance() throws Exception {
		// 在测试方法之上需要添加注解 @PrepareForTest，注解里写的类是需要 Mock 的 new 对象代码所在的类。
		File file = mock(File.class);
		ClassUnderTest underTest = new ClassUnderTest();

		// 当以参数为 bbb 创建 File 对象的时候，返回已经 Mock 的 File 对象。
		whenNew(File.class).withArguments("bbb").thenReturn(file);
		when(file.exists()).thenReturn(true);

		Assert.assertTrue(underTest.callInternalInstance("bbb"));
	}

	/**
	 * Method: callFinalMethod(ClassDependency refer)
	 * <p>
	 * <p>
	 * Mock 普通对象的 final 方法
	 */
	@Test
	@PrepareForTest(ClassDependency.class)
	public void testCallFinalMethod() {
		// 在测试方法之上加注解 @PrepareForTest，注解里写的类是需要 Mock 的 final 方法所在的类。
		ClassDependency depencency = mock(ClassDependency.class);
		ClassUnderTest underTest = new ClassUnderTest();

		when(depencency.isAlive()).thenReturn(true);

		Assert.assertTrue(underTest.callFinalMethod(depencency));
	}

	/**
	 * Method: callStaticMethod()
	 * <p>
	 * <p>
	 * Mock 静态方法
	 */
	@Test
	@PrepareForTest(ClassDependency.class)
	public void testCallStaticMethod() {
		// 在测试方法之上加注解 @PrepareForTest，注解里写的类是需要 Mock 的 static 方法所在的类。
		ClassUnderTest underTest = new ClassUnderTest();

		// 表示需要 Mock 这个类里的静态方法
		PowerMockito.mockStatic(ClassDependency.class);
		when(ClassDependency.isExist()).thenReturn(true);

		Assert.assertTrue(underTest.callStaticMethod());
	}

	/**
	 * Method: callPrivateMethod()
	 * <p>
	 * <p>
	 * Mock 私有方法
	 */
	@Test
	@PrepareForTest(ClassUnderTest.class)
	public void testCallPrivateMethod() throws Exception {
		// 在测试方法之上加注解 @PrepareForTest，注解里写的类是需要 Mock 的 private 方法所在的类。
		ClassUnderTest underTest = mock(ClassUnderTest.class);

		when(underTest.callPrivateMethod()).thenCallRealMethod();
		when(underTest, "isExist").thenReturn(true);

		Assert.assertTrue(underTest.callPrivateMethod());
	}

	/**
	 * Method: callSystemFinalMethod(String str)
	 * <p>
	 * <p>
	 * Mock JDK 中类的静态、私有方法
	 */
	@Test
	@PrepareForTest(ClassUnderTest.class)
	public void testCallSystemFinalMethod() {
		// 和 Mock 普通对象的 static、final 方法一样，只不过注解 @PrepareForTest 里写的类不一样. 注解里写的类是需要调用系统方法所在的类。
		String str = mock(String.class);
		ClassUnderTest underTest = new ClassUnderTest();

		when(str.isEmpty()).thenReturn(false);

		Assert.assertFalse(underTest.callSystemFinalMethod(str));
	}

	@Test
	@PrepareForTest(ClassUnderTest.class)
	public void testCallSystemStaticMethod() {
		ClassUnderTest underTest = new ClassUnderTest();

		PowerMockito.mockStatic(System.class);
		when(System.getProperty("aaa")).thenReturn("bbb");

		Assert.assertEquals("bbb", underTest.callSystemStaticMethod("aaa"));
	}

	/**
	 * Method: callDependency()
	 * <p>
	 * <p>
	 * Mock 依赖类中的方法（whenNew）
	 */
	@Test
	@PrepareForTest(ClassUnderTest.class)
	public void testDependency() throws Exception {
		ClassUnderTest underTest = new ClassUnderTest();
		ClassDependency dependency = mock(ClassDependency.class);

		whenNew(ClassDependency.class).withAnyArguments().thenReturn(dependency);

		when(dependency.isGod(anyString())).thenReturn(true);
		Assert.assertTrue(underTest.callDependency());
	}
} 
