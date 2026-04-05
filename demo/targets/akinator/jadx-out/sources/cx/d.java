package cx;

import bx.e;
import dx.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public b f51273a;

    /* renamed from: b, reason: collision with root package name */
    public String f51274b;

    /* renamed from: c, reason: collision with root package name */
    public h f51275c;

    /* renamed from: d, reason: collision with root package name */
    public String f51276d;

    /* renamed from: e, reason: collision with root package name */
    public String f51277e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f51278f;

    /* renamed from: g, reason: collision with root package name */
    public long f51279g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f51280h;

    @Override // cx.c
    public Object[] getArgumentArray() {
        return this.f51278f;
    }

    @Override // cx.c
    public b getLevel() {
        return this.f51273a;
    }

    public h getLogger() {
        return this.f51275c;
    }

    @Override // cx.c
    public String getLoggerName() {
        return this.f51274b;
    }

    @Override // cx.c
    public e getMarker() {
        return null;
    }

    @Override // cx.c
    public String getMessage() {
        return this.f51277e;
    }

    @Override // cx.c
    public String getThreadName() {
        return this.f51276d;
    }

    @Override // cx.c
    public Throwable getThrowable() {
        return this.f51280h;
    }

    @Override // cx.c
    public long getTimeStamp() {
        return this.f51279g;
    }

    public void setArgumentArray(Object[] objArr) {
        this.f51278f = objArr;
    }

    public void setLevel(b bVar) {
        this.f51273a = bVar;
    }

    public void setLogger(h hVar) {
        this.f51275c = hVar;
    }

    public void setLoggerName(String str) {
        this.f51274b = str;
    }

    public void setMessage(String str) {
        this.f51277e = str;
    }

    public void setThreadName(String str) {
        this.f51276d = str;
    }

    public void setThrowable(Throwable th2) {
        this.f51280h = th2;
    }

    public void setTimeStamp(long j10) {
        this.f51279g = j10;
    }

    public void setMarker(e eVar) {
    }
}
