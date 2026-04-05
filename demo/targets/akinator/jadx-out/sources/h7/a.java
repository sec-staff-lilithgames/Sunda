package h7;

import java.io.File;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import l7.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58700a;

    public a(boolean z10) {
        this.f58700a = z10;
    }

    @Override // h7.b
    public String key(File file, o oVar) {
        if (!this.f58700a) {
            return file.getPath();
        }
        return file.getPath() + AbstractJsonLexerKt.COLON + file.lastModified();
    }
}
