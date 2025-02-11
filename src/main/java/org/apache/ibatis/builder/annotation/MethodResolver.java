/**
 * Copyright 2009-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.builder.annotation;

import java.lang.reflect.Method;

/**
 * @author Eduardo Macarron
 *
 * 封装了解析器和方法
 * 因此这是一个具有了方法解析功能的方法包装类
 *
 */
public class MethodResolver {
    private final MapperAnnotationBuilder annotationBuilder;
    // 带了注解的，要处理的方法
    private final Method method;

    public MethodResolver(MapperAnnotationBuilder annotationBuilder, Method method) {
        this.annotationBuilder = annotationBuilder;
        this.method = method;
    }

    public void resolve() {
        annotationBuilder.parseStatement(method);
    }

}
