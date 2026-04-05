package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public ec f22064a;

    public dc addFixed32(int i10) {
        ec ecVar = this.f22064a;
        if (ecVar.f22095b == null) {
            ecVar.f22095b = new ArrayList();
        }
        this.f22064a.f22095b.add(Integer.valueOf(i10));
        return this;
    }

    public dc addFixed64(long j10) {
        ec ecVar = this.f22064a;
        if (ecVar.f22096c == null) {
            ecVar.f22096c = new ArrayList();
        }
        this.f22064a.f22096c.add(Long.valueOf(j10));
        return this;
    }

    public dc addGroup(gc gcVar) {
        ec ecVar = this.f22064a;
        if (ecVar.f22098e == null) {
            ecVar.f22098e = new ArrayList();
        }
        this.f22064a.f22098e.add(gcVar);
        return this;
    }

    public dc addLengthDelimited(ByteString byteString) {
        ec ecVar = this.f22064a;
        if (ecVar.f22097d == null) {
            ecVar.f22097d = new ArrayList();
        }
        this.f22064a.f22097d.add(byteString);
        return this;
    }

    public dc addVarint(long j10) {
        ec ecVar = this.f22064a;
        if (ecVar.f22094a == null) {
            ecVar.f22094a = new ArrayList();
        }
        this.f22064a.f22094a.add(Long.valueOf(j10));
        return this;
    }

    public ec build() {
        ec ecVar = this.f22064a;
        List list = ecVar.f22094a;
        if (list == null) {
            ecVar.f22094a = Collections.EMPTY_LIST;
        } else {
            ecVar.f22094a = Collections.unmodifiableList(list);
        }
        ec ecVar2 = this.f22064a;
        List list2 = ecVar2.f22095b;
        if (list2 == null) {
            ecVar2.f22095b = Collections.EMPTY_LIST;
        } else {
            ecVar2.f22095b = Collections.unmodifiableList(list2);
        }
        ec ecVar3 = this.f22064a;
        List list3 = ecVar3.f22096c;
        if (list3 == null) {
            ecVar3.f22096c = Collections.EMPTY_LIST;
        } else {
            ecVar3.f22096c = Collections.unmodifiableList(list3);
        }
        ec ecVar4 = this.f22064a;
        List list4 = ecVar4.f22097d;
        if (list4 == null) {
            ecVar4.f22097d = Collections.EMPTY_LIST;
        } else {
            ecVar4.f22097d = Collections.unmodifiableList(list4);
        }
        ec ecVar5 = this.f22064a;
        List list5 = ecVar5.f22098e;
        if (list5 == null) {
            ecVar5.f22098e = Collections.EMPTY_LIST;
        } else {
            ecVar5.f22098e = Collections.unmodifiableList(list5);
        }
        ec ecVar6 = this.f22064a;
        this.f22064a = null;
        return ecVar6;
    }

    public dc clear() {
        this.f22064a = new ec();
        return this;
    }

    public dc mergeFrom(ec ecVar) {
        if (!ecVar.f22094a.isEmpty()) {
            ec ecVar2 = this.f22064a;
            if (ecVar2.f22094a == null) {
                ecVar2.f22094a = new ArrayList();
            }
            this.f22064a.f22094a.addAll(ecVar.f22094a);
        }
        if (!ecVar.f22095b.isEmpty()) {
            ec ecVar3 = this.f22064a;
            if (ecVar3.f22095b == null) {
                ecVar3.f22095b = new ArrayList();
            }
            this.f22064a.f22095b.addAll(ecVar.f22095b);
        }
        if (!ecVar.f22096c.isEmpty()) {
            ec ecVar4 = this.f22064a;
            if (ecVar4.f22096c == null) {
                ecVar4.f22096c = new ArrayList();
            }
            this.f22064a.f22096c.addAll(ecVar.f22096c);
        }
        if (!ecVar.f22097d.isEmpty()) {
            ec ecVar5 = this.f22064a;
            if (ecVar5.f22097d == null) {
                ecVar5.f22097d = new ArrayList();
            }
            this.f22064a.f22097d.addAll(ecVar.f22097d);
        }
        if (!ecVar.f22098e.isEmpty()) {
            ec ecVar6 = this.f22064a;
            if (ecVar6.f22098e == null) {
                ecVar6.f22098e = new ArrayList();
            }
            this.f22064a.f22098e.addAll(ecVar.f22098e);
        }
        return this;
    }
}
