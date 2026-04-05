package com.moloco.sdk.acm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements j {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f45507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45508b;

    /* renamed from: c, reason: collision with root package name */
    public int f45509c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    public d(String eventName) {
        e0.checkNotNullParameter(eventName, "eventName");
        this.f45507a = new ArrayList();
        this.f45508b = eventName;
        this.f45509c = 1;
    }

    public final int getCountValue() {
        return this.f45509c;
    }

    @Override // com.moloco.sdk.acm.j
    public List<e> getEventTags() {
        return this.f45507a;
    }

    @Override // com.moloco.sdk.acm.j
    public String getName() {
        return this.f45508b;
    }

    public final void setCountValue(int i10) {
        this.f45509c = i10;
    }

    public final d withCount(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
        this.f45509c = i10;
        return this;
    }

    @Override // com.moloco.sdk.acm.j
    public d withTag(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        if (getEventTags().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            getEventTags().add(new e(key, value));
        }
        return this;
    }
}
