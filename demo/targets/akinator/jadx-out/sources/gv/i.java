package gv;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final File f58477b;

    /* renamed from: c, reason: collision with root package name */
    public final File f58478c;

    /* renamed from: e, reason: collision with root package name */
    public final String f58479e;

    public /* synthetic */ i(File file, File file2, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    public final File getFile() {
        return this.f58477b;
    }

    public final File getOther() {
        return this.f58478c;
    }

    public final String getReason() {
        return this.f58479e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(File file, File file2, String str) {
        super(e.access$constructMessage(file, file2, str));
        e0.checkNotNullParameter(file, "file");
        this.f58477b = file;
        this.f58478c = file2;
        this.f58479e = str;
    }
}
