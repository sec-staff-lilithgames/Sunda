package s4;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final t4.f f85431a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f85432b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f85433c = new n0(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f85434d;

    public o0(Typeface typeface, t4.f fVar) {
        this.f85434d = typeface;
        this.f85431a = fVar;
        this.f85432b = new char[fVar.listLength() * 2];
        int iListLength = fVar.listLength();
        for (int i10 = 0; i10 < iListLength; i10++) {
            r0 r0Var = new r0(this, i10);
            Character.toChars(r0Var.getId(), this.f85432b, i10 * 2);
            w3.i.checkNotNull(r0Var, "emoji metadata cannot be null");
            w3.i.checkArgument(r0Var.getCodepointsLength() > 0, "invalid metadata codepoint length");
            this.f85433c.a(r0Var, 0, r0Var.getCodepointsLength() - 1);
        }
    }

    public static o0 create(Typeface typeface) {
        try {
            t3.u.beginSection("EmojiCompat.MetadataRepo.create");
            return new o0(typeface, new t4.f());
        } finally {
            t3.u.endSection();
        }
    }

    public char[] getEmojiCharArray() {
        return this.f85432b;
    }

    public t4.f getMetadataList() {
        return this.f85431a;
    }

    public static o0 create(Typeface typeface, InputStream inputStream) throws IOException {
        try {
            t3.u.beginSection("EmojiCompat.MetadataRepo.create");
            return new o0(typeface, kc.p.M(inputStream));
        } finally {
            t3.u.endSection();
        }
    }

    public static o0 create(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            t3.u.beginSection("EmojiCompat.MetadataRepo.create");
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.position((int) kc.p.o(new j0(byteBufferDuplicate)).f85424a);
            return new o0(typeface, t4.f.getRootAsMetadataList(byteBufferDuplicate));
        } finally {
            t3.u.endSection();
        }
    }

    public static o0 create(AssetManager assetManager, String str) throws IOException {
        try {
            t3.u.beginSection("EmojiCompat.MetadataRepo.create");
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, str);
            InputStream inputStreamOpen = assetManager.open(str);
            try {
                t4.f fVarM = kc.p.M(inputStreamOpen);
                inputStreamOpen.close();
                return new o0(typefaceCreateFromAsset, fVarM);
            } finally {
            }
        } finally {
            t3.u.endSection();
        }
    }
}
