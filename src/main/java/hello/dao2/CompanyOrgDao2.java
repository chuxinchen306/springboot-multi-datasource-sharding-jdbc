package hello.dao2;

import hello.entity.SysCompanyOrgDo;

public interface CompanyOrgDao2 {
    SysCompanyOrgDo findCompanyOrgByOrgId(Long idOwnOrg);

    void insert(SysCompanyOrgDo sysCompanyOrgDo);
}
