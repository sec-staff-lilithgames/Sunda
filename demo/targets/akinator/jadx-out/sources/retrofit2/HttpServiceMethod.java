package retrofit2;

import b0.e2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.Utils;
import xv.i;
import xv.v0;
import xv.w0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final i callFactory;
    private final RequestFactory requestFactory;
    private final Converter<w0, ResponseT> responseConverter;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory requestFactory, i iVar, Converter<w0, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, iVar, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;
        private final boolean isUnit;

        public SuspendForBody(RequestFactory requestFactory, i iVar, Converter<w0, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z10, boolean z11) {
            super(requestFactory, iVar, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z10;
            this.isUnit = z11;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            d dVar = (d) objArr[objArr.length - 1];
            try {
                return this.isUnit ? KotlinExtensions.awaitUnit(callAdapt, dVar) : this.isNullable ? KotlinExtensions.awaitNullable(callAdapt, dVar) : KotlinExtensions.await(callAdapt, dVar);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return KotlinExtensions.suspendAndThrow(th2, dVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, i iVar, Converter<w0, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, iVar, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            d dVar = (d) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(callAdapt, dVar);
            } catch (Exception e10) {
                return KotlinExtensions.suspendAndThrow(e10, dVar);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, i iVar, Converter<w0, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = iVar;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e10) {
            throw Utils.methodError(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<w0, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw Utils.methodError(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zIsUnit;
        boolean z12 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                zIsUnit = false;
                z10 = true;
            } else {
                if (Utils.getRawType(parameterLowerBound) == Call.class) {
                    throw Utils.methodError(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound));
                }
                zIsUnit = Utils.isUnit(parameterLowerBound);
                z10 = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
            z11 = zIsUnit;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        CallAdapter callAdapterCreateCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type typeResponseType = callAdapterCreateCallAdapter.responseType();
        if (typeResponseType == v0.class) {
            throw Utils.methodError(method, e2.k(Utils.getRawType(typeResponseType), new StringBuilder("'"), "' is not a valid response body type. Did you mean ResponseBody?"), new Object[0]);
        }
        if (typeResponseType == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(typeResponseType) && !Utils.isUnit(typeResponseType)) {
            throw Utils.methodError(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        Converter converterCreateResponseConverter = createResponseConverter(retrofit, method, typeResponseType);
        i iVar = retrofit.callFactory;
        return !z12 ? new CallAdapted(requestFactory, iVar, converterCreateResponseConverter, callAdapterCreateCallAdapter) : z10 ? new SuspendForResponse(requestFactory, iVar, converterCreateResponseConverter, callAdapterCreateCallAdapter) : new SuspendForBody(requestFactory, iVar, converterCreateResponseConverter, callAdapterCreateCallAdapter, false, z11);
    }

    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    @Override // retrofit2.ServiceMethod
    public final ReturnT invoke(Object obj, Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, obj, objArr, this.callFactory, this.responseConverter), objArr);
    }
}
