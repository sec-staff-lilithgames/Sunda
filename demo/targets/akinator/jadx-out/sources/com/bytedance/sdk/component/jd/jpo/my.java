package com.bytedance.sdk.component.jd.jpo;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class my extends au {

    /* renamed from: jd, reason: collision with root package name */
    List<String> f18594jd;
    List<String> jpo;

    public my(List<String> list, List<String> list2) {
        this.jpo = list;
        this.f18594jd = list2;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {
        private final List<String> jpo = new ArrayList();

        /* renamed from: jd, reason: collision with root package name */
        private final List<String> f18595jd = new ArrayList();

        public jpo jpo(String str, String str2) {
            this.jpo.add(str);
            this.f18595jd.add(str2);
            return this;
        }

        public my jpo() {
            return new my(this.jpo, this.f18595jd);
        }
    }
}
