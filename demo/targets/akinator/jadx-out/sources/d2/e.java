package d2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.ads.beta.xyn.RnJusJ;
import d2.b;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import n1.c;
import org.xmlpull.v1.XmlPullParserException;
import p0.v;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class e {
    public static final b.a loadVectorResourceInner(Resources.Theme theme, Resources res, XmlResourceParser parser) throws XmlPullParserException, IOException, IllegalArgumentException {
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        o1.a aVar = new o1.a(parser, 0, 2, null);
        e0.checkNotNullExpressionValue(attrs, "attrs");
        c.a aVarCreateVectorImageBuilder = o1.c.createVectorImageBuilder(aVar, res, theme, attrs);
        int currentVectorNode = 0;
        while (!o1.c.isAtEnd(parser)) {
            currentVectorNode = o1.c.parseCurrentVectorNode(aVar, res, attrs, theme, aVarCreateVectorImageBuilder, currentVectorNode);
            parser.next();
        }
        return new b.a(aVarCreateVectorImageBuilder.build(), aVar.getConfig());
    }

    public static /* synthetic */ b.a loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10, Object obj) throws XmlPullParserException {
        if ((i10 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser);
    }

    public static final n1.c vectorResource(c.b bVar, int i10, w wVar, int i11) throws XmlPullParserException, Resources.NotFoundException, IOException {
        e0.checkNotNullParameter(bVar, "<this>");
        wVar.startReplaceableGroup(44534090);
        Context context = (Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        Integer numValueOf = Integer.valueOf(i10);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(numValueOf);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            e0.checkNotNullExpressionValue(resources, RnJusJ.bQQYKEgDaVbGGl);
            objRememberedValue = vectorResource(bVar, theme, resources, i10);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        n1.c cVar = (n1.c) objRememberedValue;
        wVar.endReplaceableGroup();
        return cVar;
    }

    public static /* synthetic */ n1.c vectorResource$default(c.b bVar, Resources.Theme theme, Resources resources, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return vectorResource(bVar, theme, resources, i10);
    }

    public static final n1.c vectorResource(c.b bVar, Resources.Theme theme, Resources res, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        e0.checkNotNullParameter(bVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        XmlResourceParser xml = res.getXml(i10);
        e0.checkNotNullExpressionValue(xml, "");
        o1.c.seekToStartTag(xml);
        e0.checkNotNullExpressionValue(xml, "res.getXml(resId).apply { seekToStartTag() }");
        return loadVectorResourceInner(theme, res, xml).getImageVector();
    }
}
