package com.study.dailylearning.thread.javaconcurrencypractice;

import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @description:
 * @create: 上午 8:54 16/5/2020
 **/
public class CachedFactorizer implements Servlet {


    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cacheHits;


    public synchronized long getHits() {
        return this.hits;
    }


    public synchronized double getCacheHitRatio() {
        return (double) cacheHits /(double) hits;
    }






    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        BigInteger i = extractFromRequest(servletRequest);
        BigInteger[] factors = null;


        synchronized (this) {
            ++hits;
            if (i.equals(lastNumber)) {
                ++cacheHits;
                factors = lastFactors.clone();
            }
        }
        if (factors == null) {
//            factors = factor(i);
            synchronized (this) {
                lastNumber = i;
                lastFactors = factors.clone();
            }
        }


    }

    private BigInteger extractFromRequest(ServletRequest servletRequest) {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

