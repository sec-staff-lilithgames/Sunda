package io.ktor.client.request.forms;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.Parameters;
import io.ktor.http.content.PartData;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormBuildersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$prepareForm$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$prepareForm$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements l {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$prepareFormWithBinaryData$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39732 extends f0 implements l {
        public static final C39732 INSTANCE = new C39732();

        public C39732() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$prepareFormWithBinaryData$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39745 extends f0 implements l {
        public static final C39745 INSTANCE = new C39745();

        public C39745() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$submitForm$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39752 extends f0 implements l {
        public static final C39752 INSTANCE = new C39752();

        public C39752() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$submitForm$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39765 extends f0 implements l {
        public static final C39765 INSTANCE = new C39765();

        public C39765() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$submitFormWithBinaryData$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39772 extends f0 implements l {
        public static final C39772 INSTANCE = new C39772();

        public C39772() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormBuildersKt$submitFormWithBinaryData$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39785 extends f0 implements l {
        public static final C39785 INSTANCE = new C39785();

        public C39785() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    public static final Object prepareForm(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareForm$$forInline(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareForm$default(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            parameters = Parameters.Companion.getEmpty();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareFormWithBinaryData(HttpClient httpClient, List<? extends PartData> list, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareFormWithBinaryData$$forInline(HttpClient httpClient, List<? extends PartData> list, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareFormWithBinaryData$default(HttpClient httpClient, List list, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C39732.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object submitForm(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(dVar);
    }

    private static final Object submitForm$$forInline(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object submitForm$default(HttpClient httpClient, Parameters parameters, boolean z10, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            parameters = Parameters.Companion.getEmpty();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = C39752.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static final Object submitFormWithBinaryData(HttpClient httpClient, List<? extends PartData> list, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(dVar);
    }

    private static final Object submitFormWithBinaryData$$forInline(HttpClient httpClient, List<? extends PartData> list, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object submitFormWithBinaryData$default(HttpClient httpClient, List list, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C39772.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static final Object prepareFormWithBinaryData(HttpClient httpClient, String str, List<? extends PartData> list, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareFormWithBinaryData$$forInline(HttpClient httpClient, String str, List<? extends PartData> list, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object submitFormWithBinaryData(HttpClient httpClient, String str, List<? extends PartData> list, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(dVar);
    }

    private static final Object submitFormWithBinaryData$$forInline(HttpClient httpClient, String str, List<? extends PartData> list, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareFormWithBinaryData$default(HttpClient httpClient, String str, List list, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = C39745.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object submitFormWithBinaryData$default(HttpClient httpClient, String str, List list, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = C39785.INSTANCE;
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        b0.mark(0);
        Object objExecute = httpStatement.execute(dVar);
        b0.mark(1);
        return objExecute;
    }

    public static final Object prepareForm(HttpClient httpClient, String str, Parameters parameters, boolean z10, l lVar, d<? super HttpStatement> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object submitForm(HttpClient httpClient, String str, Parameters parameters, boolean z10, l lVar, d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z10) {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(dVar);
    }

    public static /* synthetic */ Object prepareForm$default(HttpClient httpClient, String str, Parameters parameters, boolean z10, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            parameters = Parameters.Companion.getEmpty();
        }
        Parameters parameters2 = parameters;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = AnonymousClass5.INSTANCE;
        }
        return prepareForm(httpClient, str, parameters2, z11, lVar, dVar);
    }

    public static /* synthetic */ Object submitForm$default(HttpClient httpClient, String str, Parameters parameters, boolean z10, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            parameters = Parameters.Companion.getEmpty();
        }
        Parameters parameters2 = parameters;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = C39765.INSTANCE;
        }
        return submitForm(httpClient, str, parameters2, z11, lVar, dVar);
    }
}
