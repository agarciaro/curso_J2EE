package com.cursojavaee.restjavaee.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class SaludoInterceptor {
    @AroundInvoke
    public Object modificaSaludo(InvocationContext ctx) throws Exception {
        Object[] parameters = ctx.getParameters();
        String param = (String) parameters[0];
        param = param.toLowerCase();
        parameters[0] = param;
        ctx.setParameters(parameters);
        return ctx.proceed();
    }
}
