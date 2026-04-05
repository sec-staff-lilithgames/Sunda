package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f13298b = new e() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a, reason: collision with root package name */
        private Header f13300a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f13300a == null) {
                this.f13300a = Header.b(com.apm.insight.e.g());
            }
            return this.f13300a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f13299a;

    public e() {
        this(f13298b);
    }

    public Object a(String str) {
        e eVar = this.f13299a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f13299a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f13299a = eVar;
    }
}
