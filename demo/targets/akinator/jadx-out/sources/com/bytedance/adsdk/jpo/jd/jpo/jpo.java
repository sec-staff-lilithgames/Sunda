package com.bytedance.adsdk.jpo.jd.jpo;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private Object[] f17669jd;
    private String jpo;

    public Object[] jd() {
        return this.f17669jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.jpo + "', args=" + Arrays.toString(this.f17669jd) + AbstractJsonLexerKt.END_OBJ;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jpo(Object[] objArr) {
        this.f17669jd = objArr;
    }
}
