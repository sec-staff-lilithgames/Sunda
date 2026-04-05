package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends com.google.gson.internal.bind.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, int i10) {
        super(cls);
        this.f30049c = i10;
    }

    @Override // com.google.gson.internal.bind.c
    public final Date a(Date date) {
        switch (this.f30049c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
