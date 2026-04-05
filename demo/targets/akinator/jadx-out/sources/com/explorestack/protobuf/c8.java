package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c8 {

    /* renamed from: a, reason: collision with root package name */
    public ByteString f22027a;

    /* renamed from: b, reason: collision with root package name */
    public m5 f22028b;

    /* renamed from: c, reason: collision with root package name */
    public volatile MessageLite f22029c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ByteString f22030d;

    static {
        m5.getEmptyRegistry();
    }

    public c8(m5 m5Var, ByteString byteString) {
        if (m5Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f22028b = m5Var;
        this.f22027a = byteString;
    }

    public static c8 fromValue(MessageLite messageLite) {
        c8 c8Var = new c8();
        c8Var.setValue(messageLite);
        return c8Var;
    }

    public void clear() {
        this.f22027a = null;
        this.f22029c = null;
        this.f22030d = null;
    }

    public boolean containsDefaultInstance() {
        ByteString byteString = this.f22030d;
        ByteString byteString2 = ByteString.EMPTY;
        if (byteString == byteString2) {
            return true;
        }
        if (this.f22029c != null) {
            return false;
        }
        ByteString byteString3 = this.f22027a;
        return byteString3 == null || byteString3 == byteString2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        MessageLite messageLite = this.f22029c;
        MessageLite messageLite2 = c8Var.f22029c;
        return (messageLite == null && messageLite2 == null) ? toByteString().equals(c8Var.toByteString()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(c8Var.getValue(messageLite.getDefaultInstanceForType())) : getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int getSerializedSize() {
        if (this.f22030d != null) {
            return this.f22030d.size();
        }
        ByteString byteString = this.f22027a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f22029c != null) {
            return this.f22029c.getSerializedSize();
        }
        return 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        if (this.f22029c == null) {
            synchronized (this) {
                if (this.f22029c == null) {
                    try {
                        if (this.f22027a != null) {
                            this.f22029c = (MessageLite) messageLite.getParserForType().parseFrom(this.f22027a, this.f22028b);
                            this.f22030d = this.f22027a;
                        } else {
                            this.f22029c = messageLite;
                            this.f22030d = ByteString.EMPTY;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f22029c = messageLite;
                        this.f22030d = ByteString.EMPTY;
                    }
                }
            }
        }
        return this.f22029c;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(c8 c8Var) {
        ByteString byteString;
        if (c8Var.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(c8Var);
            return;
        }
        if (this.f22028b == null) {
            this.f22028b = c8Var.f22028b;
        }
        ByteString byteString2 = this.f22027a;
        if (byteString2 != null && (byteString = c8Var.f22027a) != null) {
            this.f22027a = byteString2.concat(byteString);
            return;
        }
        if (this.f22029c == null && c8Var.f22029c != null) {
            MessageLite messageLiteBuild = c8Var.f22029c;
            try {
                messageLiteBuild = messageLiteBuild.toBuilder().mergeFrom(this.f22027a, this.f22028b).build();
            } catch (InvalidProtocolBufferException unused) {
            }
            setValue(messageLiteBuild);
        } else {
            if (this.f22029c == null || c8Var.f22029c != null) {
                setValue(this.f22029c.toBuilder().mergeFrom(c8Var.f22029c).build());
                return;
            }
            MessageLite messageLiteBuild2 = this.f22029c;
            try {
                messageLiteBuild2 = messageLiteBuild2.toBuilder().mergeFrom(c8Var.f22027a, c8Var.f22028b).build();
            } catch (InvalidProtocolBufferException unused2) {
            }
            setValue(messageLiteBuild2);
        }
    }

    public void mergeFrom(y yVar, m5 m5Var) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(yVar.readBytes(), m5Var);
            return;
        }
        if (this.f22028b == null) {
            this.f22028b = m5Var;
        }
        ByteString byteString = this.f22027a;
        if (byteString != null) {
            setByteString(byteString.concat(yVar.readBytes()), this.f22028b);
        } else {
            try {
                setValue(this.f22029c.toBuilder().mergeFrom(yVar, m5Var).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void set(c8 c8Var) {
        this.f22027a = c8Var.f22027a;
        this.f22029c = c8Var.f22029c;
        this.f22030d = c8Var.f22030d;
        m5 m5Var = c8Var.f22028b;
        if (m5Var != null) {
            this.f22028b = m5Var;
        }
    }

    public void setByteString(ByteString byteString, m5 m5Var) {
        if (m5Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f22027a = byteString;
        this.f22028b = m5Var;
        this.f22029c = null;
        this.f22030d = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.f22029c;
        this.f22027a = null;
        this.f22030d = null;
        this.f22029c = messageLite;
        return messageLite2;
    }

    public ByteString toByteString() {
        if (this.f22030d != null) {
            return this.f22030d;
        }
        ByteString byteString = this.f22027a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f22030d != null) {
                    return this.f22030d;
                }
                if (this.f22029c == null) {
                    this.f22030d = ByteString.EMPTY;
                } else {
                    this.f22030d = this.f22029c.toByteString();
                }
                return this.f22030d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c8() {
    }
}
