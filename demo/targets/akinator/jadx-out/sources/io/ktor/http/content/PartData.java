package io.ktor.http.content;

import hr.kNq.ikJMrW;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.a;
import tu.f;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class PartData {
    private final o contentDisposition$delegate;
    private final o contentType$delegate;
    private final a dispose;
    private final Headers headers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BinaryChannelItem extends PartData {
        private final a provider;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.ktor.http.content.PartData$BinaryChannelItem$1, reason: invalid class name */
        public static final class AnonymousClass1 extends f0 implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4287invoke() {
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4287invoke();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryChannelItem(a provider, Headers partHeaders) {
            super(AnonymousClass1.INSTANCE, partHeaders, null);
            e0.checkNotNullParameter(provider, "provider");
            e0.checkNotNullParameter(partHeaders, "partHeaders");
            this.provider = provider;
        }

        public final a getProvider() {
            return this.provider;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BinaryItem extends PartData {
        private final a provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryItem(a provider, a dispose, Headers partHeaders) {
            super(dispose, partHeaders, null);
            e0.checkNotNullParameter(provider, "provider");
            e0.checkNotNullParameter(dispose, "dispose");
            e0.checkNotNullParameter(partHeaders, "partHeaders");
            this.provider = provider;
        }

        public final a getProvider() {
            return this.provider;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileItem extends PartData {
        private final String originalFileName;
        private final a provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FileItem(a provider, a dispose, Headers partHeaders) {
            super(dispose, partHeaders, 0 == true ? 1 : 0);
            e0.checkNotNullParameter(provider, "provider");
            e0.checkNotNullParameter(dispose, "dispose");
            e0.checkNotNullParameter(partHeaders, "partHeaders");
            this.provider = provider;
            ContentDisposition contentDisposition = getContentDisposition();
            this.originalFileName = contentDisposition != null ? contentDisposition.parameter(ContentDisposition.Parameters.FileName) : null;
        }

        public final String getOriginalFileName() {
            return this.originalFileName;
        }

        public final a getProvider() {
            return this.provider;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FormItem extends PartData {
        private final String value;

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormItem(String str, a dispose, Headers partHeaders) {
            super(dispose, partHeaders, null);
            e0.checkNotNullParameter(str, ikJMrW.vlOUnEbnPBQu);
            e0.checkNotNullParameter(dispose, "dispose");
            e0.checkNotNullParameter(partHeaders, "partHeaders");
            this.value = str;
        }
    }

    public /* synthetic */ PartData(a aVar, Headers headers, u uVar) {
        this(aVar, headers);
    }

    public final ContentDisposition getContentDisposition() {
        return (ContentDisposition) this.contentDisposition$delegate.getValue();
    }

    public final ContentType getContentType() {
        return (ContentType) this.contentType$delegate.getValue();
    }

    public final a getDispose() {
        return this.dispose;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final String getName() {
        ContentDisposition contentDisposition = getContentDisposition();
        if (contentDisposition != null) {
            return contentDisposition.getName();
        }
        return null;
    }

    public final Headers getPartHeaders() {
        return this.headers;
    }

    public final String getPartName() {
        return getName();
    }

    private PartData(a aVar, Headers headers) {
        this.dispose = aVar;
        this.headers = headers;
        s sVar = s.f87405e;
        this.contentDisposition$delegate = q.lazy(sVar, (a) new PartData$contentDisposition$2(this));
        this.contentType$delegate = q.lazy(sVar, (a) new PartData$contentType$2(this));
    }

    @f
    public static /* synthetic */ void getPartHeaders$annotations() {
    }

    @f
    public static /* synthetic */ void getPartName$annotations() {
    }
}
