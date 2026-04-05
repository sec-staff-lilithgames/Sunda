package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j4 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public l4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        l4 l4Var = new l4();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                if ((i10 & 1) == 0) {
                                    l4Var.f22338c = k7.newIntList();
                                    i10 |= 1;
                                }
                                ((l7) l4Var.f22338c).addInt(yVar.readInt32());
                            } else if (tag == 10) {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                if ((i10 & 1) == 0 && yVar.getBytesUntilLimit() > 0) {
                                    l4Var.f22338c = k7.newIntList();
                                    i10 |= 1;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l7) l4Var.f22338c).addInt(yVar.readInt32());
                                }
                                yVar.popLimit(iPushLimit);
                            } else if (tag == 16) {
                                if ((i10 & 2) == 0) {
                                    l4Var.f22340f = k7.newIntList();
                                    i10 |= 2;
                                }
                                ((l7) l4Var.f22340f).addInt(yVar.readInt32());
                            } else if (tag == 18) {
                                int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                if ((i10 & 2) == 0 && yVar.getBytesUntilLimit() > 0) {
                                    l4Var.f22340f = k7.newIntList();
                                    i10 |= 2;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l7) l4Var.f22340f).addInt(yVar.readInt32());
                                }
                                yVar.popLimit(iPushLimit2);
                            } else if (tag == 26) {
                                ByteString bytes = yVar.readBytes();
                                l4Var.f22337b = 1 | l4Var.f22337b;
                                l4Var.f22342h = bytes;
                            } else if (tag == 34) {
                                ByteString bytes2 = yVar.readBytes();
                                l4Var.f22337b |= 2;
                                l4Var.f22343i = bytes2;
                            } else if (tag == 50) {
                                ByteString bytes3 = yVar.readBytes();
                                if ((i10 & 16) == 0) {
                                    l4Var.f22344j = new f8();
                                    i10 |= 16;
                                }
                                l4Var.f22344j.add(bytes3);
                            } else if (!l4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(l4Var);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(l4Var);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    ((e) l4Var.f22338c).makeImmutable();
                }
                if ((i10 & 2) != 0) {
                    ((e) l4Var.f22340f).makeImmutable();
                }
                if ((i10 & 16) != 0) {
                    l4Var.f22344j = l4Var.f22344j.getUnmodifiableView();
                }
                l4Var.unknownFields = ccVarNewBuilder.build();
                l4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            ((e) l4Var.f22338c).makeImmutable();
        }
        if ((i10 & 2) != 0) {
            ((e) l4Var.f22340f).makeImmutable();
        }
        if ((i10 & 16) != 0) {
            l4Var.f22344j = l4Var.f22344j.getUnmodifiableView();
        }
        l4Var.unknownFields = ccVarNewBuilder.build();
        l4Var.makeExtensionsImmutable();
        return l4Var;
    }
}
