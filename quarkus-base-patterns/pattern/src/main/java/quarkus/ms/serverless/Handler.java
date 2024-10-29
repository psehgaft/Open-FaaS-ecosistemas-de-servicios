package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.quarkus.runtime.LambdaApplication;
import io.quarkus.runtime.LambdaServer;
import io.quarkus.runtime.LambdaServerResponse;
import io.quarkus.runtime.util.LambdaUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Handler implements RequestHandler<InputStream, OutputStream> {
    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
        // Inicializar Quarkus y manejar la solicitud
        LambdaServer.runApplication(input, output, context, LambdaApplication.class);
    }
}