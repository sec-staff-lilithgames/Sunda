package wr;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wr.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final i f90961k;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f90962a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f90963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90964c;

    /* renamed from: d, reason: collision with root package name */
    public final f f90965d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90966e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[][] f90967f;

    /* renamed from: g, reason: collision with root package name */
    public final List f90968g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f90969h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f90970i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f90971j;

    static {
        g gVar = new g();
        gVar.f90938f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        gVar.f90939g = Collections.EMPTY_LIST;
        f90961k = new i(gVar);
    }

    public i(g gVar) {
        this.f90962a = gVar.f90933a;
        this.f90963b = gVar.f90934b;
        this.f90964c = gVar.f90935c;
        this.f90965d = gVar.f90936d;
        this.f90966e = gVar.f90937e;
        this.f90967f = gVar.f90938f;
        this.f90968g = gVar.f90939g;
        this.f90969h = gVar.f90940h;
        this.f90970i = gVar.f90941i;
        this.f90971j = gVar.f90942j;
    }

    public static g a(i iVar) {
        g gVar = new g();
        gVar.f90933a = iVar.f90962a;
        gVar.f90934b = iVar.f90963b;
        gVar.f90935c = iVar.f90964c;
        gVar.f90936d = iVar.f90965d;
        gVar.f90937e = iVar.f90966e;
        gVar.f90938f = iVar.f90967f;
        gVar.f90939g = iVar.f90968g;
        gVar.f90940h = iVar.f90969h;
        gVar.f90941i = iVar.f90970i;
        gVar.f90942j = iVar.f90971j;
        return gVar;
    }

    public String getAuthority() {
        return this.f90964c;
    }

    public String getCompressor() {
        return this.f90966e;
    }

    public f getCredentials() {
        return this.f90965d;
    }

    public z0 getDeadline() {
        return this.f90962a;
    }

    public Executor getExecutor() {
        return this.f90963b;
    }

    public Integer getMaxInboundMessageSize() {
        return this.f90970i;
    }

    public Integer getMaxOutboundMessageSize() {
        return this.f90971j;
    }

    public <T> T getOption(h hVar) {
        mh.p1.checkNotNull(hVar, C3191e4.h.W);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f90967f;
            if (i10 >= objArr.length) {
                return (T) hVar.f90947b;
            }
            if (hVar.equals(objArr[i10][0])) {
                return (T) objArr[i10][1];
            }
            i10++;
        }
    }

    public List<u.a> getStreamTracerFactories() {
        return this.f90968g;
    }

    public boolean isWaitForReady() {
        return Boolean.TRUE.equals(this.f90969h);
    }

    public String toString() {
        mh.f1 f1VarAdd = mh.g1.toStringHelper(this).add("deadline", this.f90962a).add("authority", this.f90964c).add("callCredentials", this.f90965d);
        Executor executor = this.f90963b;
        return f1VarAdd.add("executor", executor != null ? executor.getClass() : null).add("compressorName", this.f90966e).add("customOptions", Arrays.deepToString(this.f90967f)).add("waitForReady", isWaitForReady()).add("maxInboundMessageSize", this.f90970i).add("maxOutboundMessageSize", this.f90971j).add("streamTracerFactories", this.f90968g).toString();
    }

    public i withAuthority(String str) {
        g gVarA = a(this);
        gVarA.f90935c = str;
        return new i(gVarA);
    }

    public i withCallCredentials(f fVar) {
        g gVarA = a(this);
        gVarA.f90936d = fVar;
        return new i(gVarA);
    }

    public i withCompression(String str) {
        g gVarA = a(this);
        gVarA.f90937e = str;
        return new i(gVarA);
    }

    public i withDeadline(z0 z0Var) {
        g gVarA = a(this);
        gVarA.f90933a = z0Var;
        return new i(gVarA);
    }

    public i withDeadlineAfter(long j10, TimeUnit timeUnit) {
        return withDeadline(z0.after(j10, timeUnit));
    }

    public i withExecutor(Executor executor) {
        g gVarA = a(this);
        gVarA.f90934b = executor;
        return new i(gVarA);
    }

    public i withMaxInboundMessageSize(int i10) {
        mh.p1.checkArgument(i10 >= 0, "invalid maxsize %s", i10);
        g gVarA = a(this);
        gVarA.f90941i = Integer.valueOf(i10);
        return new i(gVarA);
    }

    public i withMaxOutboundMessageSize(int i10) {
        mh.p1.checkArgument(i10 >= 0, "invalid maxsize %s", i10);
        g gVarA = a(this);
        gVarA.f90942j = Integer.valueOf(i10);
        return new i(gVarA);
    }

    public <T> i withOption(h hVar, T t10) {
        Object[][] objArr;
        mh.p1.checkNotNull(hVar, C3191e4.h.W);
        mh.p1.checkNotNull(t10, "value");
        g gVarA = a(this);
        int i10 = 0;
        while (true) {
            objArr = this.f90967f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (hVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i10 == -1 ? 1 : 0), 2);
        gVarA.f90938f = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i10 == -1) {
            gVarA.f90938f[objArr.length] = new Object[]{hVar, t10};
        } else {
            gVarA.f90938f[i10] = new Object[]{hVar, t10};
        }
        return new i(gVarA);
    }

    public i withStreamTracerFactory(u.a aVar) {
        List list = this.f90968g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(aVar);
        g gVarA = a(this);
        gVarA.f90939g = Collections.unmodifiableList(arrayList);
        return new i(gVarA);
    }

    public i withWaitForReady() {
        g gVarA = a(this);
        gVarA.f90940h = Boolean.TRUE;
        return new i(gVarA);
    }

    public i withoutWaitForReady() {
        g gVarA = a(this);
        gVarA.f90940h = Boolean.FALSE;
        return new i(gVarA);
    }
}
