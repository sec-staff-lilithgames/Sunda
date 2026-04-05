package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b8 extends c8 {

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f21948e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator f21949b;

        public a(Iterator<Map.Entry<Object, Object>> it) {
            this.f21949b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21949b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21949b.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> entry = (Map.Entry) this.f21949b.next();
            if (!(entry.getValue() instanceof b8)) {
                return entry;
            }
            a8 a8Var = new a8();
            a8Var.f21850b = entry;
            return a8Var;
        }
    }

    public b8(MessageLite messageLite, m5 m5Var, ByteString byteString) {
        super(m5Var, byteString);
        this.f21948e = messageLite;
    }

    @Override // com.explorestack.protobuf.c8
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.f22029c == this.f21948e;
    }

    @Override // com.explorestack.protobuf.c8
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.f21948e);
    }

    @Override // com.explorestack.protobuf.c8
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
