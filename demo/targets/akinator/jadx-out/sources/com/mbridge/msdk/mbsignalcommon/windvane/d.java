package com.mbridge.msdk.mbsignalcommon.windvane;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* renamed from: a, reason: collision with root package name */
    private String f41940a;

    /* renamed from: b, reason: collision with root package name */
    private String f41941b;

    d(String str, String str2) {
        this.f41940a = str;
        this.f41941b = str2;
    }

    public String a() {
        return this.f41941b;
    }

    public String b() {
        return this.f41940a;
    }
}
