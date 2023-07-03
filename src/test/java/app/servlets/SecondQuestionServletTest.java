package app.servlets;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

class SecondQuestionServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher dispatcher;

    private SecondQuestionServlet servlet;

    @Test
    void testDoGet() throws ServletException, IOException {
        MockitoAnnotations.openMocks(this);
        servlet = new SecondQuestionServlet();

        when(request.getRequestDispatcher("views/question2.jsp")).thenReturn(dispatcher);

        servlet.doGet(request, response);

        verify(request).getRequestDispatcher("views/question2.jsp");
        verify(dispatcher).forward(request, response);
    }
}