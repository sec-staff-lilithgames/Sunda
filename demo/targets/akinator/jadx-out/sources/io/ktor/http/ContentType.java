package io.ktor.http;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import sv.n0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentType extends HeaderValueWithParameters {
    private final String contentSubtype;
    private final String contentType;
    public static final Companion Companion = new Companion(null);
    private static final ContentType Any = new ContentType("*", "*", null, 4, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Application {
        private static final ContentType FormUrlEncoded;
        private static final ContentType JavaScript;
        private static final ContentType ProblemJson;
        public static final Application INSTANCE = new Application();
        private static final ContentType Any = new ContentType("application", "*", null, 4, null);
        private static final ContentType Atom = new ContentType("application", "atom+xml", null, 4, null);
        private static final ContentType Cbor = new ContentType("application", "cbor", null, 4, null);
        private static final ContentType Json = new ContentType("application", "json", null, 4, null);
        private static final ContentType HalJson = new ContentType("application", "hal+json", null, 4, null);
        private static final ContentType OctetStream = new ContentType("application", "octet-stream", null, 4, null);
        private static final ContentType Rss = new ContentType("application", "rss+xml", null, 4, null);
        private static final ContentType Xml = new ContentType("application", "xml", null, 4, null);
        private static final ContentType Xml_Dtd = new ContentType("application", "xml-dtd", null, 4, null);
        private static final ContentType Zip = new ContentType("application", "zip", null, 4, 0 == true ? 1 : 0);
        private static final ContentType GZip = new ContentType("application", "gzip", null, 4, null);
        private static final ContentType Pdf = new ContentType("application", "pdf", null, 4, null);
        private static final ContentType Xlsx = new ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
        private static final ContentType Docx = new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);
        private static final ContentType Pptx = new ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
        private static final ContentType ProtoBuf = new ContentType("application", "protobuf", null, 4, 0 == true ? 1 : 0);
        private static final ContentType Wasm = new ContentType("application", "wasm", null, 4, null);
        private static final ContentType ProblemXml = new ContentType("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            u uVar = null;
            JavaScript = new ContentType("application", "javascript", null, 4, uVar);
            FormUrlEncoded = new ContentType("application", "x-www-form-urlencoded", null, 4, uVar);
            ProblemJson = new ContentType("application", "problem+json", null, 4, uVar);
        }

        private Application() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getAtom() {
            return Atom;
        }

        public final ContentType getCbor() {
            return Cbor;
        }

        public final ContentType getDocx() {
            return Docx;
        }

        public final ContentType getFormUrlEncoded() {
            return FormUrlEncoded;
        }

        public final ContentType getGZip() {
            return GZip;
        }

        public final ContentType getHalJson() {
            return HalJson;
        }

        public final ContentType getJavaScript() {
            return JavaScript;
        }

        public final ContentType getJson() {
            return Json;
        }

        public final ContentType getOctetStream() {
            return OctetStream;
        }

        public final ContentType getPdf() {
            return Pdf;
        }

        public final ContentType getPptx() {
            return Pptx;
        }

        public final ContentType getProblemJson() {
            return ProblemJson;
        }

        public final ContentType getProblemXml() {
            return ProblemXml;
        }

        public final ContentType getProtoBuf() {
            return ProtoBuf;
        }

        public final ContentType getRss() {
            return Rss;
        }

        public final ContentType getWasm() {
            return Wasm;
        }

        public final ContentType getXlsx() {
            return Xlsx;
        }

        public final ContentType getXml() {
            return Xml;
        }

        public final ContentType getXml_Dtd() {
            return Xml_Dtd;
        }

        public final ContentType getZip() {
            return Zip;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Audio {
        public static final Audio INSTANCE = new Audio();
        private static final ContentType Any = new ContentType("audio", "*", null, 4, null);
        private static final ContentType MP4 = new ContentType("audio", "mp4", null, 4, null);
        private static final ContentType MPEG = new ContentType("audio", "mpeg", null, 4, null);
        private static final ContentType OGG = new ContentType("audio", "ogg", null, 4, null);

        private Audio() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getMP4() {
            return MP4;
        }

        public final ContentType getMPEG() {
            return MPEG;
        }

        public final ContentType getOGG() {
            return OGG;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ContentType getAny() {
            return ContentType.Any;
        }

        public final ContentType parse(String value) throws BadContentTypeFormatException {
            e0.checkNotNullParameter(value, "value");
            if (n0.isBlank(value)) {
                return getAny();
            }
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.Companion;
            HeaderValue headerValue = (HeaderValue) y0.last((List) HttpHeaderValueParserKt.parseHeaderValue(value));
            String value2 = headerValue.getValue();
            List<HeaderValueParam> params = headerValue.getParams();
            int iIndexOf$default = n0.indexOf$default((CharSequence) value2, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                if (e0.areEqual(n0.trim(value2).toString(), "*")) {
                    return ContentType.Companion.getAny();
                }
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring = value2.substring(0, iIndexOf$default);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = n0.trim(strSubstring).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring2 = value2.substring(iIndexOf$default + 1);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = n0.trim(strSubstring2).toString();
            if (n0.contains$default((CharSequence) string, ' ', false, 2, (Object) null) || n0.contains$default((CharSequence) string2, ' ', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            if (string2.length() == 0 || n0.contains$default((CharSequence) string2, '/', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            return new ContentType(string, string2, params);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Font {
        public static final Font INSTANCE = new Font();
        private static final ContentType Any = new ContentType("font", "*", null, 4, null);
        private static final ContentType Collection = new ContentType("font", "collection", null, 4, null);
        private static final ContentType Otf = new ContentType("font", "otf", null, 4, null);
        private static final ContentType Sfnt = new ContentType("font", "sfnt", null, 4, null);
        private static final ContentType Ttf = new ContentType("font", "ttf", null, 4, null);
        private static final ContentType Woff = new ContentType("font", "woff", null, 4, null);
        private static final ContentType Woff2 = new ContentType("font", "woff2", null, 4, null);

        private Font() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getCollection() {
            return Collection;
        }

        public final ContentType getOtf() {
            return Otf;
        }

        public final ContentType getSfnt() {
            return Sfnt;
        }

        public final ContentType getTtf() {
            return Ttf;
        }

        public final ContentType getWoff() {
            return Woff;
        }

        public final ContentType getWoff2() {
            return Woff2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Image {
        public static final Image INSTANCE = new Image();
        private static final ContentType Any = new ContentType("image", "*", null, 4, null);
        private static final ContentType GIF = new ContentType("image", "gif", null, 4, null);
        private static final ContentType JPEG = new ContentType("image", "jpeg", null, 4, null);
        private static final ContentType PNG = new ContentType("image", "png", null, 4, null);
        private static final ContentType SVG = new ContentType("image", "svg+xml", null, 4, null);
        private static final ContentType XIcon = new ContentType("image", "x-icon", null, 4, null);

        private Image() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getGIF() {
            return GIF;
        }

        public final ContentType getJPEG() {
            return JPEG;
        }

        public final ContentType getPNG() {
            return PNG;
        }

        public final ContentType getSVG() {
            return SVG;
        }

        public final ContentType getXIcon() {
            return XIcon;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Message {
        public static final Message INSTANCE = new Message();
        private static final ContentType Any = new ContentType(PglCryptUtils.KEY_MESSAGE, "*", null, 4, null);
        private static final ContentType Http = new ContentType(PglCryptUtils.KEY_MESSAGE, "http", null, 4, null);

        private Message() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getHttp() {
            return Http;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MultiPart {
        public static final MultiPart INSTANCE = new MultiPart();
        private static final ContentType Any = new ContentType("multipart", "*", null, 4, null);
        private static final ContentType Mixed = new ContentType("multipart", "mixed", null, 4, null);
        private static final ContentType Alternative = new ContentType("multipart", "alternative", null, 4, null);
        private static final ContentType Related = new ContentType("multipart", "related", null, 4, null);
        private static final ContentType FormData = new ContentType("multipart", "form-data", null, 4, null);
        private static final ContentType Signed = new ContentType("multipart", "signed", null, 4, null);
        private static final ContentType Encrypted = new ContentType("multipart", "encrypted", null, 4, null);
        private static final ContentType ByteRanges = new ContentType("multipart", "byteranges", null, 4, null);

        private MultiPart() {
        }

        public final ContentType getAlternative() {
            return Alternative;
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getByteRanges() {
            return ByteRanges;
        }

        public final ContentType getEncrypted() {
            return Encrypted;
        }

        public final ContentType getFormData() {
            return FormData;
        }

        public final ContentType getMixed() {
            return Mixed;
        }

        public final ContentType getRelated() {
            return Related;
        }

        public final ContentType getSigned() {
            return Signed;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Text {
        public static final Text INSTANCE = new Text();
        private static final ContentType Any = new ContentType("text", "*", null, 4, null);
        private static final ContentType Plain = new ContentType("text", "plain", null, 4, null);
        private static final ContentType CSS = new ContentType("text", "css", null, 4, null);
        private static final ContentType CSV = new ContentType("text", "csv", null, 4, null);
        private static final ContentType Html = new ContentType("text", "html", null, 4, null);
        private static final ContentType JavaScript = new ContentType("text", "javascript", null, 4, null);
        private static final ContentType VCard = new ContentType("text", "vcard", null, 4, null);
        private static final ContentType Xml = new ContentType("text", "xml", null, 4, null);
        private static final ContentType EventStream = new ContentType("text", "event-stream", null, 4, null);

        private Text() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getCSS() {
            return CSS;
        }

        public final ContentType getCSV() {
            return CSV;
        }

        public final ContentType getEventStream() {
            return EventStream;
        }

        public final ContentType getHtml() {
            return Html;
        }

        public final ContentType getJavaScript() {
            return JavaScript;
        }

        public final ContentType getPlain() {
            return Plain;
        }

        public final ContentType getVCard() {
            return VCard;
        }

        public final ContentType getXml() {
            return Xml;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Video {
        public static final Video INSTANCE = new Video();
        private static final ContentType Any = new ContentType("video", "*", null, 4, null);
        private static final ContentType MPEG = new ContentType("video", "mpeg", null, 4, null);
        private static final ContentType MP4 = new ContentType("video", "mp4", null, 4, null);
        private static final ContentType OGG = new ContentType("video", "ogg", null, 4, null);
        private static final ContentType QuickTime = new ContentType("video", "quicktime", null, 4, null);

        private Video() {
        }

        public final ContentType getAny() {
            return Any;
        }

        public final ContentType getMP4() {
            return MP4;
        }

        public final ContentType getMPEG() {
            return MPEG;
        }

        public final ContentType getOGG() {
            return OGG;
        }

        public final ContentType getQuickTime() {
            return QuickTime;
        }
    }

    public /* synthetic */ ContentType(String str, String str2, String str3, List list, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? p0.emptyList() : list);
    }

    private final boolean hasParameter(String str, String str2) {
        int size = getParameters().size();
        if (size != 0) {
            if (size != 1) {
                List<HeaderValueParam> parameters = getParameters();
                if ((parameters instanceof Collection) && parameters.isEmpty()) {
                    return false;
                }
                for (HeaderValueParam headerValueParam : parameters) {
                    if (k0.equals(headerValueParam.getName(), str, true) && k0.equals(headerValueParam.getValue(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            HeaderValueParam headerValueParam2 = getParameters().get(0);
            if (k0.equals(headerValueParam2.getName(), str, true) && k0.equals(headerValueParam2.getValue(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ContentType)) {
            return false;
        }
        ContentType contentType = (ContentType) obj;
        return k0.equals(this.contentType, contentType.contentType, true) && k0.equals(this.contentSubtype, contentType.contentSubtype, true) && e0.areEqual(getParameters(), contentType.getParameters());
    }

    public final String getContentSubtype() {
        return this.contentSubtype;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        String str = this.contentType;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (getParameters().hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final boolean match(ContentType pattern) {
        boolean zEquals;
        e0.checkNotNullParameter(pattern, "pattern");
        if (!e0.areEqual(pattern.contentType, "*") && !k0.equals(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!e0.areEqual(pattern.contentSubtype, "*") && !k0.equals(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (HeaderValueParam headerValueParam : pattern.getParameters()) {
            String strComponent1 = headerValueParam.component1();
            String strComponent2 = headerValueParam.component2();
            if (e0.areEqual(strComponent1, "*")) {
                if (!e0.areEqual(strComponent2, "*")) {
                    List<HeaderValueParam> parameters = getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            if (k0.equals(((HeaderValueParam) it.next()).getValue(), strComponent2, true)) {
                            }
                        }
                    }
                    zEquals = false;
                }
                zEquals = true;
                break;
            }
            String strParameter = parameter(strComponent1);
            if (!e0.areEqual(strComponent2, "*")) {
                zEquals = k0.equals(strParameter, strComponent2, true);
            } else {
                if (strParameter != null) {
                    zEquals = true;
                    break;
                    break;
                }
                zEquals = false;
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public final ContentType withParameter(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return hasParameter(name, value) ? this : new ContentType(this.contentType, this.contentSubtype, getContent(), y0.plus((Collection<? extends HeaderValueParam>) getParameters(), new HeaderValueParam(name, value)));
    }

    public final ContentType withoutParameters() {
        if (getParameters().isEmpty()) {
            return this;
        }
        return new ContentType(this.contentType, this.contentSubtype, null, 4, null);
    }

    private ContentType(String str, String str2, String str3, List<HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentType(String str, String str2, List list, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? p0.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(String contentType, String contentSubtype, List<HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        e0.checkNotNullParameter(contentType, "contentType");
        e0.checkNotNullParameter(contentSubtype, "contentSubtype");
        e0.checkNotNullParameter(parameters, "parameters");
    }

    public final boolean match(String pattern) {
        e0.checkNotNullParameter(pattern, "pattern");
        return match(Companion.parse(pattern));
    }
}
