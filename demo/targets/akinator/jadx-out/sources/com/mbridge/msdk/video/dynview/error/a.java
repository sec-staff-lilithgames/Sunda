package com.mbridge.msdk.video.dynview.error;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: a, reason: collision with root package name */
    private int f44405a;

    /* renamed from: b, reason: collision with root package name */
    private String f44406b;

    a(int i10, String str) {
        this.f44405a = i10;
        this.f44406b = str;
    }

    public int a() {
        return this.f44405a;
    }

    public String b() {
        return this.f44406b;
    }
}
