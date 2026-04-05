package o2;

import android.graphics.Matrix;
import android.graphics.Shader;
import g2.s;
import j1.b0;
import j1.b2;
import j1.d0;
import j1.d2;
import j1.e0;
import j1.j2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final void a(g2.l lVar, e0 e0Var, b0 b0Var, d2 d2Var, r2.n nVar) {
        List<s> paragraphInfoList$ui_text_release = lVar.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = paragraphInfoList$ui_text_release.get(i10);
            sVar.getParagraph().paint(e0Var, b0Var, d2Var, nVar);
            e0Var.translate(0.0f, sVar.getParagraph().getHeight());
        }
    }

    public static final void drawMultiParagraph(g2.l lVar, e0 canvas, b0 brush, d2 d2Var, r2.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        canvas.save();
        if (lVar.getParagraphInfoList$ui_text_release().size() <= 1 || (brush instanceof j2)) {
            a(lVar, canvas, brush, d2Var, nVar);
        } else if (brush instanceof b2) {
            List<s> paragraphInfoList$ui_text_release = lVar.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                s sVar = paragraphInfoList$ui_text_release.get(i10);
                height += sVar.getParagraph().getHeight();
                fMax = Math.max(fMax, sVar.getParagraph().getWidth());
            }
            Shader shaderMo4695createShaderuvyYCjk = ((b2) brush).mo4695createShaderuvyYCjk(i1.p.Size(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo4695createShaderuvyYCjk.getLocalMatrix(matrix);
            List<s> paragraphInfoList$ui_text_release2 = lVar.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                s sVar2 = paragraphInfoList$ui_text_release2.get(i11);
                sVar2.getParagraph().paint(canvas, d0.ShaderBrush(shaderMo4695createShaderuvyYCjk), d2Var, nVar);
                canvas.translate(0.0f, sVar2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -sVar2.getParagraph().getHeight());
                shaderMo4695createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    public static /* synthetic */ void drawMultiParagraph$default(g2.l lVar, e0 e0Var, b0 b0Var, d2 d2Var, r2.n nVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d2Var = null;
        }
        if ((i10 & 8) != 0) {
            nVar = null;
        }
        drawMultiParagraph(lVar, e0Var, b0Var, d2Var, nVar);
    }
}
