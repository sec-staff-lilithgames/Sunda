package u3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f87800c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f87801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87802f;

    public h(String str, Context context, g gVar, int i10) {
        this.f87799b = str;
        this.f87800c = context;
        this.f87801e = gVar;
        this.f87802f = i10;
    }

    @Override // java.util.concurrent.Callable
    public l call() {
        Object[] objArr = {this.f87801e};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return m.b(this.f87800c, Collections.unmodifiableList(arrayList), this.f87799b, this.f87802f);
    }
}
