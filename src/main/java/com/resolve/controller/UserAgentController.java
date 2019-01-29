package com.resolve.controller;

import com.resolve.model.AgentInfo;
import eu.bitwalker.useragentutils.UserAgent;
import net.sf.uadetector.ReadableUserAgent;
import net.sf.uadetector.UserAgentStringParser;
import net.sf.uadetector.service.UADetectorServiceFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAgentController {


    @RequestMapping(value = "/device", method = RequestMethod.GET)
    public ReadableUserAgent getUserAgent(@RequestHeader("User-Agent") String userAgentInfo) {

        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentInfo);

        UserAgentStringParser parser =  UADetectorServiceFactory.getResourceModuleParser();
        ReadableUserAgent agent = parser.parse(userAgentInfo);




        AgentInfo agentInfo = new AgentInfo();

        System.out.println(agent.getFamily().getName());
        System.out.println(agent.getFamily().getPattern());
        System.out.println(agent.getName());
        System.out.println(agent.getOperatingSystem().getFamily());
        System.out.println(agent.getOperatingSystem().getFamilyName());
        System.out.println(agent.getOperatingSystem().getName());
        System.out.println(agent.getOperatingSystem().getProducer());
        System.out.println(agent.getOperatingSystem().getVersionNumber());
        System.out.println(agent.getProducer());
        System.out.println(agent.getType());
        System.out.println(agent.getTypeName());
        System.out.println(agent.getVersionNumber());




        System.out.println("end of file ");











//        agentInfo.setManufacturer(userAgent.getOperatingSystem().getManufacturer().getName());
//        agentInfo.setBrand(userAgent.getOperatingSystem().getDeviceType().getName());
//        agentInfo.setModel(userAgent.getOperatingSystem().getGroup().getName());
//        agentInfo.setBrowser(userAgent.getBrowser().getName());
//        agentInfo.setVersion(userAgent.getBrowserVersion().toString());
//        agentInfo.setLastUsed(userAgent.toString());
//        System.out.println(userAgent.toString());
        return agent;
    }
}
