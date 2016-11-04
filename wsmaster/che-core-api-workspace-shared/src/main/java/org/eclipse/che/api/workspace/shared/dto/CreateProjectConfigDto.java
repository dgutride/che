/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.workspace.shared.dto;

import org.eclipse.che.api.core.factory.FactoryParameter;
import org.eclipse.che.api.core.rest.shared.dto.Link;
import org.eclipse.che.dto.shared.DTO;

import java.util.List;
import java.util.Map;

import static org.eclipse.che.api.core.factory.FactoryParameter.Obligation.OPTIONAL;

/**
 * Data transfer object (DTO) for creating of project.
 *
 * @author Roman Nikitenko
 */
@DTO
public interface CreateProjectConfigDto extends ProjectConfigDto {
    @FactoryParameter(obligation = OPTIONAL)
    Map<String, String> getOptions();

    void setOptions(Map<String, String> options);

    CreateProjectConfigDto withOptions(Map<String, String> options);

    CreateProjectConfigDto withName(String name);

    CreateProjectConfigDto withPath(String path);

    CreateProjectConfigDto withDescription(String description);

    CreateProjectConfigDto withType(String type);

    CreateProjectConfigDto withMixins(List<String> mixins);

    CreateProjectConfigDto withAttributes(Map<String, List<String>> attributes);

    CreateProjectConfigDto withSource(SourceStorageDto source);

    CreateProjectConfigDto withLinks(List<Link> links);

    CreateProjectConfigDto withProblems(List<ProjectProblemDto> problems);
}
