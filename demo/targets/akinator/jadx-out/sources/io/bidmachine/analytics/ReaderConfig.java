package io.bidmachine.analytics;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ReaderConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f59863a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59864b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59865c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f59866d;

    /* renamed from: e, reason: collision with root package name */
    private final List f59867e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Rule {

        /* renamed from: a, reason: collision with root package name */
        private final String f59868a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59869b;

        public Rule(String str, String str2) {
            this.f59868a = str;
            this.f59869b = str2;
        }

        public final String getPath() {
            return this.f59869b;
        }

        public final String getTag() {
            return this.f59868a;
        }
    }

    public ReaderConfig(String str, String str2, long j10, boolean z10, List<Rule> list) {
        this.f59863a = str;
        this.f59864b = str2;
        this.f59865c = j10;
        this.f59866d = z10;
        this.f59867e = list;
    }

    public final long getInterval() {
        return this.f59865c;
    }

    public final String getName() {
        return this.f59863a;
    }

    public final List<Rule> getRules() {
        return this.f59867e;
    }

    public final boolean getUniqueOnly() {
        return this.f59866d;
    }

    public final String getUrl() {
        return this.f59864b;
    }
}
