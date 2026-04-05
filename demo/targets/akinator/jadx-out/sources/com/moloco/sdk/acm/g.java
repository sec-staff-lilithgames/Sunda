package com.moloco.sdk.acm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements j {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.g f45608a;

    /* renamed from: b, reason: collision with root package name */
    public long f45609b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45610c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final String f45611d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final g create(String eventName) {
            e0.checkNotNullParameter(eventName, "eventName");
            return new g(eventName, new com.moloco.sdk.acm.services.g(new com.moloco.sdk.acm.services.i()), null);
        }
    }

    public g(String str, com.moloco.sdk.acm.services.g gVar, u uVar) {
        this.f45608a = gVar;
        this.f45611d = str;
    }

    @Override // com.moloco.sdk.acm.j
    public List<e> getEventTags() {
        return this.f45610c;
    }

    @Override // com.moloco.sdk.acm.j
    public String getName() {
        return this.f45611d;
    }

    public final long getTime() {
        return this.f45609b;
    }

    public final void startTimer() {
        this.f45608a.c();
    }

    public final void stopTimer() {
        if (this.f45609b == 0) {
            this.f45609b = this.f45608a.a();
        }
    }

    public final g withTime(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
        this.f45609b = j10;
        return this;
    }

    @Override // com.moloco.sdk.acm.j
    public g withTag(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        if (getEventTags().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            getEventTags().add(new e(key, value));
        }
        return this;
    }
}
