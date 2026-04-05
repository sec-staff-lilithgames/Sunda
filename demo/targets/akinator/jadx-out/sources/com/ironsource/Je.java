package com.ironsource;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Je {

    /* renamed from: a, reason: collision with root package name */
    private final String f34721a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f34722b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34723c;

    public Je(String str, List<String> list, boolean z10) {
        this.f34721a = str;
        this.f34722b = list;
        this.f34723c = z10;
    }

    public final boolean a() {
        if (this.f34723c) {
            List<String> list = this.f34722b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f34721a;
                    if (str2 != null && sv.k0.startsWith$default(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f34722b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f34721a;
                if (str4 != null && sv.n0.contains$default((CharSequence) str4, (CharSequence) str3, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b() {
        return this.f34721a;
    }

    public /* synthetic */ Je(String str, List list, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }
}
