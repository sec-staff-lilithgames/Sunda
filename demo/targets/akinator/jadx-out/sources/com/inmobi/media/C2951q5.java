package com.inmobi.media;

import java.util.Iterator;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2951q5 extends nv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2967r5 f33280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2951q5(EnumC3108za enumC3108za, C2967r5 c2967r5) {
        super(enumC3108za);
        this.f33280a = c2967r5;
    }

    @Override // nv.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
        EnumC3108za enumC3108za = (EnumC3108za) obj2;
        if (Aa.a((EnumC3108za) obj) == Aa.a(enumC3108za)) {
            return;
        }
        Iterator it = this.f33280a.f33304b.iterator();
        while (it.hasNext()) {
            ((Ca) it.next()).a(enumC3108za);
        }
    }
}
