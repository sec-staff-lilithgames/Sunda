package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 extends y0 {

    /* renamed from: f, reason: collision with root package name */
    public final dd.n f78950f;

    /* renamed from: g, reason: collision with root package name */
    public final rc.m f78951g;

    /* renamed from: h, reason: collision with root package name */
    public volatile dd.n f78952h;

    /* renamed from: i, reason: collision with root package name */
    public volatile dd.n f78953i;

    /* renamed from: j, reason: collision with root package name */
    public final dd.n f78954j;

    /* renamed from: k, reason: collision with root package name */
    public final Enum f78955k;

    public u0(dd.n nVar, rc.m mVar) {
        super(-1, nVar.getEnumClass(), null);
        this.f78950f = nVar;
        this.f78951g = mVar;
        this.f78955k = nVar.getDefaultValue();
        this.f78954j = null;
        this.f78952h = null;
    }

    @Override // oc.y0
    public Object _parse(String str, jc.k kVar) throws IOException {
        rc.m mVar = this.f78951g;
        if (mVar != null) {
            try {
                return mVar.call1(str);
            } catch (Exception e10) {
                dd.i.unwrapAndThrowAsIAE(e10);
            }
        }
        dd.n nVarConstructUsingIndex = this.f78954j;
        if (nVarConstructUsingIndex == null) {
            if (kVar.isEnabled(jc.l.READ_ENUMS_USING_TO_STRING)) {
                nVarConstructUsingIndex = this.f78952h;
                if (nVarConstructUsingIndex == null) {
                    synchronized (this) {
                        try {
                            nVarConstructUsingIndex = this.f78952h;
                            if (nVarConstructUsingIndex == null) {
                                nVarConstructUsingIndex = dd.n.constructUsingToString(kVar.getConfig(), this.f78950f.getEnumClass());
                                this.f78952h = nVarConstructUsingIndex;
                            }
                        } finally {
                        }
                    }
                }
            } else {
                nVarConstructUsingIndex = this.f78950f;
            }
        }
        Enum<?> enumFindEnum = nVarConstructUsingIndex.findEnum(str);
        if (enumFindEnum == null && kVar.isEnabled(lc.u.READ_ENUM_KEYS_USING_INDEX)) {
            nVarConstructUsingIndex = this.f78953i;
            if (nVarConstructUsingIndex == null) {
                synchronized (this) {
                    try {
                        nVarConstructUsingIndex = this.f78953i;
                        if (nVarConstructUsingIndex == null) {
                            nVarConstructUsingIndex = dd.n.constructUsingIndex(kVar.getConfig(), this.f78950f.getEnumClass());
                            this.f78953i = nVarConstructUsingIndex;
                        }
                    } finally {
                    }
                }
            }
            enumFindEnum = nVarConstructUsingIndex.findEnum(str);
        }
        return enumFindEnum == null ? (this.f78955k == null || !kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) ? !kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? kVar.handleWeirdKey(this.f78964c, str, "not one of the values accepted for Enum class: %s", nVarConstructUsingIndex.getEnumIds()) : enumFindEnum : this.f78955k : enumFindEnum;
    }

    public u0(dd.n nVar, rc.m mVar, dd.n nVar2, dd.n nVar3, dd.n nVar4) {
        super(-1, nVar.getEnumClass(), null);
        this.f78950f = nVar;
        this.f78951g = mVar;
        this.f78955k = nVar.getDefaultValue();
        this.f78954j = nVar2;
        this.f78952h = nVar3;
        this.f78953i = nVar4;
    }
}
