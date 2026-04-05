package com.google.gson;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum x extends z {
    public x() {
        super("DEFAULT", 0);
    }

    @Override // com.google.gson.z
    public q serialize(Long l9) {
        return l9 == null ? s.f30067b : new v(l9);
    }
}
