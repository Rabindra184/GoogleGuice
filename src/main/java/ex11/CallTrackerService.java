package ex11;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Rabindra Biswal
 * @since 21/09/23 8:12 am
 */

public class CallTrackerService implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before " + methodInvocation.getMethod().getName());
        Object result = methodInvocation.proceed();
        System.out.println("After " + methodInvocation.getMethod().getName());
        return result;
    }
}
