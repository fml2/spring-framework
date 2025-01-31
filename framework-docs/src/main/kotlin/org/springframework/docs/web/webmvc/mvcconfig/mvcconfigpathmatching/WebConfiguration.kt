/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.docs.web.webmvc.mvcconfig.mvcconfigpathmatching

import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.method.HandlerTypePredicate
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.util.pattern.PathPatternParser

// tag::snippet[]
@Configuration
class WebConfiguration : WebMvcConfigurer {

	override fun configurePathMatch(configurer: PathMatchConfigurer) {
		configurer.addPathPrefix("/api", HandlerTypePredicate.forAnnotation(RestController::class.java))
	}

	fun patternParser(): PathPatternParser {
		val pathPatternParser = PathPatternParser()
		//...
		return pathPatternParser
	}
}
// end::snippet[]