package app.servlets;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static org.mockito.Mockito.*;

class FirstQuestionServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher dispatcher;
    @InjectMocks
    private FirstQuestionServlet servlet;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new FirstQuestionServlet();
    }

    @Test
    void testDoGet() throws Exception {
        when(request.getRequestDispatcher("views/question1.jsp")).thenReturn(dispatcher);

        servlet.doGet(request, response);

        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoPost() throws Exception {
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("name")).thenReturn("John Doe");
        when(request.getRequestDispatcher("views/question1.jsp")).thenReturn(dispatcher);

        servlet.doPost(request, response);

        verify(session).setAttribute("userName", "John Doe");
        verify(dispatcher).forward(request, response);
    }
}