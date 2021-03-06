package com.github.gauthierj.dsm.webapi.client;

import com.github.gauthierj.dsm.webapi.client.authentication.AuthenticationHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

public class AuthenticatedDsmWebapiClient extends DsmWebapiClientImpl {

    @Autowired
    private AuthenticationHolder authenticationHolder;

    @Override
    public void customizeUri(UriComponentsBuilder uriComponentsBuilder) {
        uriComponentsBuilder.queryParam("_sid", authenticationHolder.getLoginInformation().getSid());
    }
}
