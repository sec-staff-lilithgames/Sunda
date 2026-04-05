package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends z0 implements e2 {
    protected n0 extensions = n0.f26437d;

    private void eagerlyMergeMessageSetExtension(w wVar, x0 x0Var, h0 h0Var, int i10) throws IOException {
        parseExtension(wVar, h0Var, x0Var, (i10 << 3) | 2, i10);
    }

    private void mergeMessageSetExtensionFromBytes(s sVar, h0 h0Var, x0 x0Var) throws IOException {
        d2 d2Var = (d2) this.extensions.f26438a.get(x0Var.f26531d);
        c2 builder = d2Var != null ? d2Var.toBuilder() : null;
        if (builder == null) {
            builder = x0Var.f26530c.newBuilderForType();
        }
        t0 t0Var = (t0) builder;
        t0Var.getClass();
        try {
            w wVarD = sVar.d();
            t0Var.a(wVarD, h0Var);
            wVarD.a(0);
            Object objA = t0Var.a();
            n0 n0VarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            w0 w0Var = x0Var.f26531d;
            if (w0Var.f26516c.a() == k4.ENUM) {
                objA = Integer.valueOf(((d1) objA).a());
            }
            n0VarEnsureExtensionsAreMutable.c(w0Var, objA);
        } catch (n1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading " + t0Var.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e11);
        }
    }

    private <MessageType extends d2> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, w wVar, h0 h0Var) throws IOException {
        int iU = 0;
        q qVarE = null;
        x0 x0VarA = null;
        while (true) {
            int iT = wVar.t();
            if (iT == 0) {
                break;
            }
            if (iT == 16) {
                iU = wVar.u();
                if (iU != 0) {
                    x0VarA = h0Var.a(iU, messagetype);
                }
            } else if (iT == 26) {
                if (iU == 0 || x0VarA == null) {
                    qVarE = wVar.e();
                } else {
                    eagerlyMergeMessageSetExtension(wVar, x0VarA, h0Var, iU);
                    qVarE = null;
                }
            } else if (!wVar.e(iT)) {
                break;
            }
        }
        wVar.a(12);
        if (qVarE == null || iU == 0) {
            return;
        }
        if (x0VarA != null) {
            mergeMessageSetExtensionFromBytes(qVarE, h0Var, x0VarA);
        } else {
            mergeLengthDelimitedField(iU, qVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.fyber.inneractive.sdk.protobuf.d1] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.w r7, com.fyber.inneractive.sdk.protobuf.h0 r8, com.fyber.inneractive.sdk.protobuf.x0 r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.w, com.fyber.inneractive.sdk.protobuf.h0, com.fyber.inneractive.sdk.protobuf.x0, int, int):boolean");
    }

    private void verifyExtensionContainingType(x0 x0Var) {
        if (x0Var.f26528a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public n0 ensureExtensionsAreMutable() {
        n0 n0Var = this.extensions;
        if (n0Var.f26439b) {
            this.extensions = n0Var.m503clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.e2
    public /* bridge */ /* synthetic */ d2 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        Type type = (Type) n0Var.f26438a.get(x0VarAccess$000.f26531d);
        if (type == 0) {
            return (Type) x0VarAccess$000.f26529b;
        }
        w0 w0Var = x0VarAccess$000.f26531d;
        if (w0Var.f26517d) {
            if (w0Var.f26516c.a() == k4.ENUM) {
                ?? r12 = (Type) new ArrayList();
                for (Object objA : (List) type) {
                    if (x0VarAccess$000.f26531d.f26516c.a() == k4.ENUM) {
                        objA = x0VarAccess$000.f26531d.f26514a.a(((Integer) objA).intValue());
                    }
                    r12.add(objA);
                }
                return r12;
            }
        } else if (w0Var.f26516c.a() == k4.ENUM) {
            return (Type) x0VarAccess$000.f26531d.f26514a.a(((Integer) type).intValue());
        }
        return type;
    }

    public final <Type> int getExtensionCount(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f26531d;
        n0Var.getClass();
        if (!w0Var.f26517d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = n0Var.f26438a.get(w0Var);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final <Type> boolean hasExtension(e0 e0Var) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f26531d;
        n0Var.getClass();
        if (w0Var.f26517d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return n0Var.f26438a.get(w0Var) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        n0 n0Var = this.extensions;
        if (n0Var.f26439b) {
            this.extensions = n0Var.m503clone();
        }
        this.extensions.a(messagetype.extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ c2 newBuilderForType() {
        return newBuilderForType();
    }

    public v0 newExtensionWriter() {
        return new v0(this);
    }

    public v0 newMessageSetExtensionWriter() {
        return new v0(this);
    }

    public <MessageType extends d2> boolean parseUnknownField(MessageType messagetype, w wVar, h0 h0Var, int i10) throws IOException {
        int i11 = i10 >>> 3;
        return parseExtension(wVar, h0Var, h0Var.a(i11, messagetype), i10, i11);
    }

    public <MessageType extends d2> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, w wVar, h0 h0Var, int i10) throws IOException {
        if (i10 != 11) {
            return (i10 & 7) == 2 ? parseUnknownField(messagetype, wVar, h0Var, i10) : wVar.e(i10);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, wVar, h0Var);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ c2 toBuilder() {
        return toBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(e0 e0Var, int i10) {
        x0 x0VarAccess$000 = z0.access$000(e0Var);
        verifyExtensionContainingType(x0VarAccess$000);
        n0 n0Var = this.extensions;
        w0 w0Var = x0VarAccess$000.f26531d;
        n0Var.getClass();
        if (w0Var.f26517d) {
            Object obj = n0Var.f26438a.get(w0Var);
            if (obj != null) {
                Type type = (Type) ((List) obj).get(i10);
                return x0VarAccess$000.f26531d.f26516c.a() == k4.ENUM ? (Type) x0VarAccess$000.f26531d.f26514a.a(((Integer) type).intValue()) : type;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
