package com.cursojavaee.restjavaee.service;

import com.cursojavaee.restjavaee.interceptor.SaludoInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
public class SaludoImpl implements Saludo{
    @Override
    @Interceptors(SaludoInterceptor.class)
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }
}
