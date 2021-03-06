package com.disorder.presentation.utils;

public class LooxLikeAPIUserAvatarGenerator implements UserAvatarUrlGenerator {

    private final String baseUrl;

    public LooxLikeAPIUserAvatarGenerator(String baseUrl) {
        this.baseUrl = baseUrl + "/user/avatar/";
    }

    @Override
    public String getUrl(String username) {
        return baseUrl + username;
    }
}
