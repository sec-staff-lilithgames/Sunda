package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class Response {
    public final String body;
    public final int code;
    public final Map<String, String> headers;
    public final String msg;

    public Response(Map<String, String> map, String str, int i10, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i10;
        this.msg = str2;
    }
}
