/*
 * Copyright (c) 2010 Paul Merlin <paul@nosphere.org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.qi4j.library.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import org.qi4j.api.structure.Application;

/**
 * @author Paul Merlin <p.merlin@nosphere.org>
 */
public class Qi4jServlet
        extends HttpServlet
{

    private static final long serialVersionUID = 1L;
    public static final String CTX_APP_ATTR = "qi4j-application-servlet-context-attribute";

    public static Application application( ServletContext servletContext )
    {
        return ( Application ) servletContext.getAttribute( CTX_APP_ATTR ); // TODO try/catch and find a suitable Qi4j exception
    }

    protected final Application application;

    public Qi4jServlet()
    {
        super();
        application = Qi4jServlet.application( getServletContext() );
    }

}
