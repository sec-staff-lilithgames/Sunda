package hv;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class v implements kv.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f59257c;

    public /* synthetic */ v(boolean z10, int i10) {
        this.f59256b = i10;
        this.f59257c = z10;
    }

    @Override // kv.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a copyToRecursively = (a) obj;
        Path src = (Path) obj2;
        Path dst = (Path) obj3;
        switch (this.f59256b) {
            case 0:
                e0.checkNotNullParameter(copyToRecursively, "<this>");
                e0.checkNotNullParameter(src, "src");
                e0.checkNotNullParameter(dst, "dst");
                return ((c) copyToRecursively).copyToIgnoringExistingDirectory(src, dst, this.f59257c);
            default:
                e0.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
                e0.checkNotNullParameter(src, "src");
                e0.checkNotNullParameter(dst, "dst");
                LinkOption[] linkOptions = j.f59208a.toLinkOptions(this.f59257c);
                boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
                LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                    if (zIsDirectory) {
                        c0.deleteRecursively(dst);
                    }
                    f1 f1Var = new f1(2);
                    f1Var.addSpread(linkOptions);
                    f1Var.add(StandardCopyOption.REPLACE_EXISTING);
                    CopyOption[] copyOptionArr = (CopyOption[]) f1Var.toArray(new CopyOption[f1Var.size()]);
                    e0.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
                }
                return b.f59184b;
        }
    }
}
