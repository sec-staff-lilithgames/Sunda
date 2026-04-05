package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f22538a;

    /* renamed from: b, reason: collision with root package name */
    public Map.Entry f22539b;

    public r6(s6 s6Var) {
        Iterator<Map.Entry<a6, Object>> it = s6Var.f22625b.iterator();
        this.f22538a = it;
        if (it.hasNext()) {
            this.f22539b = it.next();
        }
    }

    public void writeUntil(int i10, h0 h0Var) throws IOException {
        while (true) {
            Map.Entry entry = this.f22539b;
            if (entry == null || ((Descriptors.FieldDescriptor) entry.getKey()).getNumber() >= i10) {
                return;
            }
            b6.writeField((Descriptors.FieldDescriptor) this.f22539b.getKey(), this.f22539b.getValue(), h0Var);
            Iterator it = this.f22538a;
            if (it.hasNext()) {
                this.f22539b = (Map.Entry) it.next();
            } else {
                this.f22539b = null;
            }
        }
    }
}
