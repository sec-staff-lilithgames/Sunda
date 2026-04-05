package io.odeeo.internal.d;

import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f63350a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f63351e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f63352a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63353b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63354c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63355d;

        public a(int i10, int i11, int i12) {
            this.f63352a = i10;
            this.f63353b = i11;
            this.f63354c = i12;
            this.f63355d = g0.isEncodingLinearPcm(i12) ? g0.getPcmFrameSize(i12, i11) : -1;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f63352a);
            sb2.append(", channelCount=");
            sb2.append(this.f63353b);
            sb2.append(", encoding=");
            return e3.g.m(sb2, this.f63354c, AbstractJsonLexerKt.END_LIST);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a configure(a aVar) throws b;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
