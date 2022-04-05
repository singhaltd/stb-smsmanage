package com.sms.stserve.utils;

import javax.servlet.http.HttpServletRequest;

public final class HttpUtils {

    private static final String[] IP_HEADERS = {
        "X-Forwarded-For",
        "Proxy-Client-IP",
        "WL-Proxy-Client-IP",
        "HTTP_X_FORWARDED_FOR",
        "HTTP_X_FORWARDED",
        "HTTP_X_CLUSTER_CLIENT_IP",
        "HTTP_CLIENT_IP",
        "HTTP_FORWARDED_FOR",
        "HTTP_FORWARDED",
        "HTTP_VIA",
        "REMOTE_ADDR"

        // you can add more matching headers here ...
    };

    private HttpUtils() {
        // nothing here ...
    }

    public static String getRequestIP(HttpServletRequest request) {
        for (String header: IP_HEADERS){
            String val = request.getHeader(header);
            if (val == null || val.isEmpty()) {
                continue;
            }
            String[] parts = val.split("\\s*,\\s*");
            return parts[0];
        }
        return request.getRemoteHost();
    }
}