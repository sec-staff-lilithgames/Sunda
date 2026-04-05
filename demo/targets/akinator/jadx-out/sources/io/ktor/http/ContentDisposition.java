package io.ktor.http;

import com.ironsource.C3191e4;
import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentDisposition extends HeaderValueWithParameters {
    private static final ContentDisposition Attachment;
    public static final Companion Companion = new Companion(null);
    private static final ContentDisposition File;
    private static final ContentDisposition Inline;
    private static final ContentDisposition Mixed;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ContentDisposition getAttachment() {
            return ContentDisposition.Attachment;
        }

        public final ContentDisposition getFile() {
            return ContentDisposition.File;
        }

        public final ContentDisposition getInline() {
            return ContentDisposition.Inline;
        }

        public final ContentDisposition getMixed() {
            return ContentDisposition.Mixed;
        }

        public final ContentDisposition parse(String value) {
            e0.checkNotNullParameter(value, "value");
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.Companion;
            HeaderValue headerValue = (HeaderValue) y0.last((List) HttpHeaderValueParserKt.parseHeaderValue(value));
            return new ContentDisposition(headerValue.getValue(), headerValue.getParams());
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Parameters {
        public static final String CreationDate = "creation-date";
        public static final String FileName = "filename";
        public static final String FileNameAsterisk = "filename*";
        public static final String Handling = "handling";
        public static final Parameters INSTANCE = new Parameters();
        public static final String ModificationDate = "modification-date";
        public static final String Name = "name";
        public static final String ReadDate = "read-date";
        public static final String Size = "size";

        private Parameters() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        File = new ContentDisposition(C3191e4.h.f36473b, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        Mixed = new ContentDisposition("mixed", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        Attachment = new ContentDisposition("attachment", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        Inline = new ContentDisposition("inline", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ContentDisposition(String str, List list, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? p0.emptyList() : list);
    }

    public static /* synthetic */ ContentDisposition withParameter$default(ContentDisposition contentDisposition, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return contentDisposition.withParameter(str, str2, z10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ContentDisposition)) {
            return false;
        }
        ContentDisposition contentDisposition = (ContentDisposition) obj;
        return e0.areEqual(getDisposition(), contentDisposition.getDisposition()) && e0.areEqual(getParameters(), contentDisposition.getParameters());
    }

    public final String getDisposition() {
        return getContent();
    }

    public final String getName() {
        return parameter("name");
    }

    public int hashCode() {
        return getParameters().hashCode() + (getDisposition().hashCode() * 31);
    }

    public final ContentDisposition withParameter(String key, String value, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        if (z10) {
            value = ContentDispositionKt.encodeContentDispositionAttribute(key, value);
        }
        return new ContentDisposition(getDisposition(), y0.plus((Collection<? extends HeaderValueParam>) getParameters(), new HeaderValueParam(key, value)));
    }

    public final ContentDisposition withParameters(List<HeaderValueParam> newParameters) {
        e0.checkNotNullParameter(newParameters, "newParameters");
        return new ContentDisposition(getDisposition(), y0.plus((Collection) getParameters(), (Iterable) newParameters));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDisposition(String disposition, List<HeaderValueParam> parameters) {
        super(disposition, parameters);
        e0.checkNotNullParameter(disposition, "disposition");
        e0.checkNotNullParameter(parameters, "parameters");
    }
}
