package gv;

import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends i {
    public /* synthetic */ a(File file, File file2, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(File file, File file2, String str) {
        super(file, file2, str);
        e0.checkNotNullParameter(file, "file");
    }
}
