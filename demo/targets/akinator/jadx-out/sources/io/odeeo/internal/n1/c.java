package io.odeeo.internal.n1;

import io.odeeo.sdk.state.CancellationOption;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f65060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65061b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, ? extends Object> f65062c;

    /* renamed from: d, reason: collision with root package name */
    public CancellationOption f65063d;

    public /* synthetic */ c(String str, int i10, Map map, CancellationOption cancellationOption, u uVar) {
        this(str, i10, map, cancellationOption);
    }

    public void cancel(CoroutineScope coroutineScope) {
        io.odeeo.internal.b2.a.d("BaseState cancel", new Object[0]);
        CancellationOption.execute$default(this.f65063d, coroutineScope, null, 2, null);
    }

    public int getCode() {
        return this.f65061b;
    }

    public String getMessage() {
        return this.f65060a;
    }

    public final CancellationOption getOnCancellation() {
        return this.f65063d;
    }

    public final Map<String, Object> getParameters() {
        return this.f65062c;
    }

    public final c plus(c other) {
        e0.checkNotNullParameter(other, "other");
        if (!(this instanceof f) || !(other instanceof f)) {
            return d.f65064e;
        }
        return new f(null, null, null, 7, null);
    }

    public final void setOnCancellation(CancellationOption cancellationOption) {
        e0.checkNotNullParameter(cancellationOption, "<set-?>");
        this.f65063d = cancellationOption;
    }

    public final void setParameters(Map<String, ? extends Object> map) {
        e0.checkNotNullParameter(map, "<set-?>");
        this.f65062c = map;
    }

    public c(String str, int i10, Map<String, ? extends Object> map, CancellationOption cancellationOption) {
        this.f65060a = str;
        this.f65061b = i10;
        this.f65062c = map;
        this.f65063d = cancellationOption;
    }

    public /* synthetic */ c(String str, int i10, Map map, CancellationOption cancellationOption, int i11, u uVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? -1 : i10, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? CancellationOption.Cancel : cancellationOption, null);
    }
}
