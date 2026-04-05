package com.mbridge.msdk.tracker;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f44126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44130e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44131f;

    /* renamed from: g, reason: collision with root package name */
    public final p f44132g;

    /* renamed from: h, reason: collision with root package name */
    public final d f44133h;

    /* renamed from: i, reason: collision with root package name */
    public final w f44134i;

    /* renamed from: j, reason: collision with root package name */
    public final f f44135j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private p f44139d;

        /* renamed from: h, reason: collision with root package name */
        private d f44143h;

        /* renamed from: i, reason: collision with root package name */
        private w f44144i;

        /* renamed from: j, reason: collision with root package name */
        private f f44145j;

        /* renamed from: a, reason: collision with root package name */
        private int f44136a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f44137b = 15000;

        /* renamed from: c, reason: collision with root package name */
        private int f44138c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f44140e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f44141f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f44142g = 604800000;

        public b a(int i10, p pVar) {
            this.f44138c = i10;
            this.f44139d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f44136a = 50;
                return this;
            }
            this.f44136a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f44137b = 15000;
                return this;
            }
            this.f44137b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f44141f = 50;
                return this;
            }
            this.f44141f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f44140e = 2;
                return this;
            }
            this.f44140e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f44142g = 604800000;
                return this;
            }
            this.f44142g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f44143h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f44144i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f44145j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f44143h) && com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f44144i) && com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f44139d) || y.b(this.f44139d.b())) && com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f44126a = bVar.f44136a;
        this.f44127b = bVar.f44137b;
        this.f44128c = bVar.f44138c;
        this.f44129d = bVar.f44140e;
        this.f44130e = bVar.f44141f;
        this.f44131f = bVar.f44142g;
        this.f44132g = bVar.f44139d;
        this.f44133h = bVar.f44143h;
        this.f44134i = bVar.f44144i;
        this.f44135j = bVar.f44145j;
    }
}
